/**
 * Created with JetBrains WebStorm.
 * User: chuck
 * Date: 6/23/13
 * Time: 8:29 AM
 * To change this template use File | Settings | File Templates.
 */

var HealthDao = function () {
    // ************************************************************************
    // PRIVILEGED METHODS
    // MAY BE INVOKED PUBLICLY AND MAY ACCESS PRIVATE ITEMS
    // MAY NOT BE CHANGED; MAY BE REPLACED WITH PUBLIC FLAVORS
    // ************************************************************************
    var cardioTimeArray_private = new Array();
    var weigthArray_private = new Array();
    var dateArray_private = new Array();

    //        SETTER
    this.saveCardioTimeArray = function(cardioTime) {
        cardioTimeArray_private.push(cardioTime);
        localStorage["cardioTimes"] = JSON.stringify(cardioTimeArray_private);
    };
    this.saveWeigthArray = function setPublicIncrement(weigth) {
        weigthArray_private.push(weigth);
        localStorage["weigths"] = JSON.stringify(weigthArray_private.push);
    };
    this.saveDateArray = function setPublicGetCount(date) {
        dateArray_private.push(date);
        localStorage["dates"] = JSON.stringify(dateArray_private);
    };
    //        GETTER
    this.getCardioTimeArray = function() {
        var cardioTimeArray = JSON.parse(localStorage["cardioTimes"]);
        return cardioTimeArray;
    };
    this.getWeigthArray = function () {
        var weigthArray = JSON.parse(localStorage["weigths"]);
        return weigthArray;
    };
    this.getDateArray = function () {
        var dateArray = JSON.parse(localStorage["dates"]);
        return dateArray;
    };
};







