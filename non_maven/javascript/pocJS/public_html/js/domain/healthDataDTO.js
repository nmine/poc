var HealthDataDTO = function (cardioTime, weigth, date) {
        // ************************************************************************ 
  	// PRIVATE VARIABLES AND FUNCTIONS 
 	// ONLY PRIVELEGED METHODS MAY VIEW/EDIT/INVOKE 
 	// *********************************************************************** 
        //array of dimension that contains the values and the dates
        //use to fill the plot
        var cardioTimeArray_private = cardioTime;
        var weigthArray_private = weigth;
        // ************************************************************************ 
	// PRIVILEGED METHODS 
	// MAY BE INVOKED PUBLICLY AND MAY ACCESS PRIVATE ITEMS 
	// MAY NOT BE CHANGED; MAY BE REPLACED WITH PUBLIC FLAVORS 
	// ************************************************************************ 
        //        SETTER
        this.setCardioTimeArray = function(cardioTimeArray) {
            this.cardioTimeArray_private  = cardioTimeArray; 
        };
        this.setWeigthArray = function (weigthArray) {
            this.weigthArray_private = weigthArray;
        };
        //        GETTER
        this.getCardioTimeArray = function() {
            return cardioTimeArray_private;
        };
        this.getWeigthArray = function () {
            return weigthArray_private;
        };

    };






