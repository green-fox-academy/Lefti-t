
  //   1. store the element that says 'The King' in the 'king' variable.
    //   console.log it.

    let theKing = document.getElementById('b325');
    console.log('king', theKing);

    
    //   2. store 'The Businessman' and 'The Lamplighter'
    //   in the 'businessLamp' variable.
    //   console.log each of them.

    //OR
    // let businessLamp = document.getElementsByClassName('asteroid  big');
    // for(let i = 0; i < businessLamp.length;i++){
    // console.log(businessLamp[i]);
    // }

    Array.from(document.getElementsByClassName("asteroid  big")).forEach(function(item) {
        console.log(item);
     });

     //   3. store 'The King' and 'The Conceited Man'
    //   in the 'conceitedKing' variable.
    //   alert them one by one.

    let conceitedKing = document.getElementsByClassName("container");
    // alert(conceitedKing[0]);
    // alert(conceitedKing[1]);

     
    //   4. store 'The King', 'The Conceited Man' and 'The Lamplighter'
    //   in the 'noBusiness' variable.
    //   console.log each of them.

    let noBusiness = document.getElementsByClassName("container asteroidb329big");
    for(let i = 0; i < noBusiness.length;i++){
        console.log(noBusiness[i]);
        }