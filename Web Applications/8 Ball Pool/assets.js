let sprites = {};
let assetStillLoading = 0;

function assetsLoadingLoop(callback){

    if(assetStillLoading){
        requestAnimationFrame(assetsLoadingLoop.bind(this, callback));
    }
    else
    {
        callback();
    }
}

function loadAssets(callback){

    function loadSprites(filename)
    {
        assetStillLoading++;

        let spriteImage = new Image();
        spriteImage.src = "assets/sprites/"+filename;

        spriteImage.onload = function(){
            assetStillLoading--;
        }

        return spriteImage;
    }

    sprites.background = loadSprites('spr_background4.png'); 
    sprites.stick = loadSprites('spr_stick.png');
    sprites.whiteBall = loadSprites('spr_ball2.png')

    assetsLoadingLoop(callback);
}