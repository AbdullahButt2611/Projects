const STICK_ORIGIN = new Vector2(970,11);




function stick(position)
{
    this.position = position;
    this.rotation = 0;
}

stick.prototype.update = function(){
    
   this.updateRotation();

}

stick.prototype.draw = function(){
    Canvas.drawImage(sprites.stick, this.position, STICK_ORIGIN, this.rotation);
}


stick.prototype.updateRotation = function(){

    let opposite = Mouse.position.y - this.position.y;
    let adjacent = Mouse.position.x - this.position.x;

    this.rotation = Math.atan2(opposite.adjacent);

}