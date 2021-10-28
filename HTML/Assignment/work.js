var i = 0
function counter(){
    if(i<100000){
        i = i+1;
        postMessage(i);
    }
    setTimeout("counter()",500);
  //  setInterval(150000000)
}
counter();