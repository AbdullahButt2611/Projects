function stick(position)
{
    this.position = position;
    this.origin = new Vector2(500,10);
}

stick.prototype.update = function(){
    
    this.position = Mouse.position;

    if(Mouse.left.pressed)
    {
        console.log("Pressed Left");
    }

}

stick.prototype.draw = function(){
    Canvas.drawImage(sprites.stick, this.position, this.origin);
}