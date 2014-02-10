function BuildFromJSON(json) {
    var cardioArray = new Array();
    cardioArray.push(json.cardioTime);
    var weithArray = new Array();
    weithArray.push(json.weigth);
    var dateArray = new Array();
    dateArray.push(json.date);
    var myObj = new HealthData(json.cardioTime, json.weigth, json.date);
    return myObj;
}

function BuildJSONFromObject(cardioTime, weigth, date) {
    var jsonObject = {"cardioTime" : cardioTime, "weigth" : weigth, "date" : date};
    return jsonObject;
}

function BuildJSONFromObjectArray(arrayObject) {
    var JSONArray = new Array();
    for(i = 0; i < arrayObject.length; i++) {
        JSONArray.push(BuildJSONFromObject(arrayObject[i].getCardioTime(), arrayObject[i].getWeigth(), arrayObject[i].getDate()));
    }       
    return JSONArray;
}
    
    

//var healthDataObject = new HealthData(1,2,3);
//var healthDataObject2 = new HealthData(1,2,3);
//var healthDataObject3 = new HealthData(1,2,3);
//var healthDataObject4 = new HealthData(1,2,3);
//var jsonObjectresult = BuildJSONFromObject(healthDataObject.getCardioTime(), healthDataObject.getWeigth(), healthDataObject.getDate() );
//
//var arrayObject = new Array();
//var arrayJSON = new Array();
//arrayObject.push(healthDataObject);
//arrayObject.push(healthDataObject2);
//arrayObject.push(healthDataObject3);
//arrayObject.push(healthDataObject4);
//var arrayJSON = BuildJSONFromObjectArray(arrayObject);
//console.log(arrayJSON[0].cardioTime);
