var feet = document.getElementById("feet");
var inches = document.getElementById("inch");


feet.addEventListener("input", function(){
    let f = this.value;
    let i = f*12;
    inches.value = i;
});

inches.addEventListener("input", function(){
    let f = this.value;
    let i = f/12;

    if(!i.isInteger)            //If i has decimal points then what to do.
    {
        i=i.toFixed(2);         //Gives the decimal places upto two values.
    }
    feet.value = i;
});