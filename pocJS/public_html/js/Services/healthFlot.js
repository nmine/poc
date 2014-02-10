$(function() {
    
    //data getting from ui
    var weightFromUI;
    var cardioTimeFromUI;
    var dateFromDatePicker;

    var dateArray = new Array();
    //instance of object that will contain the data array
    //contain array of two dimension to generate the flot
    var healthData = new HealthDataDTO(new Array(),new Array());
    //contains arrays of one dimension to persist in localstorage
    var healthDao = new HealthDao();



    function doPlot() {
        $.plot("#placeholder", [
            {data: healthData.getWeigthArray(), label: "Weigth"},
            {data: healthData.getCardioTimeArray(), label: "Cardio Time", yaxis: 2}
        ], {
            xaxes: [
                {
                    mode: "time",
                    timeformat: "%d/%m/%Y"
                }
            ],
            yaxes: [
                {
                    min: 78,
                    max: 85,
                    position: "left"
                },
                {
                    min: 0,
                    max: 90,
                    position: "rigth"
                }
            ],
            legend: {
                position: "sw"
            },
            grid: {
                hoverable: true,
                clickable: true
            },
            series: {
                lines: {
                    show: true
                },
                points: {
                    show: true
                }
            }
        });
    }

    doPlot();

    
    
		
    
    //get info from ui
    $('#dp3').datepicker().on('changeDate', function(ev) {
        dateFromDatePicker = ev.date;
    });

    //clean the date in order that the user has to choose 
    //a date (and so trgigger the changedate event and fill the var datFromDatePicker) 
    $('.span2').val("");
    hideErrors();
    $('#buttonAddDatas').bind('click', function() {
        var isValid = true;
        hideErrors();
        if ($("#weigthInput").val() !== "") {
            weightFromUI = $("#weigthInput").val();
        } else {
            $(".control-group-weigth").addClass("error");
            $(".help-weigth").fadeIn();
            isValid = false;
        }
        if ($("#cardioTimeInput").val() !== "") {
            cardioTimeFromUI = $("#cardioTimeInput").val();
        } else {
            $(".control-group-cardioTime").addClass("error");
            $(".help-cardioTime").fadeIn();
            isValid = false;
        }
        if ($(".date").val() === null) {
            $(".control-group-date").addClass("error");
            $(".help-date").fadeIn();
            isValid = false;
        }
        if (isValid) {
            //use of the DTO object in order to fill the plot
            healthData.getWeigthArray().push([dateFromDatePicker.getTime(), weightFromUI]);
            healthData.getCardioTimeArray().push([dateFromDatePicker.getTime(), cardioTimeFromUI]);
            //save in localStorage with the DAO
            //take the weigth of the double dimmension array of the healthdata (time, value)
            healthDao.saveWeigthArray(weightFromUI);
            healthDao.saveCardioTimeArray(cardioTimeFromUI);
            //set the time selected in a array to persist it via the DAO
            dateArray.push(dateFromDatePicker.getTime());
            healthDao.saveDateArray(dateArray);
            doPlot();
            var dates = JSON.parse(localStorage["dates"]);
            alert(dates[0]);
        }
    });

    function hideErrors() {
        $(".control-group").removeClass("error");
        $(".help-weigth").hide();
        $(".help-cardioTime").hide();
        $(".help-date").hide();
    }
   
});