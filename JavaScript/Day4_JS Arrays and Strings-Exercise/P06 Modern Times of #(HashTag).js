function solve(textToProcess){

    let regex = /#[A-Za-z]+/gm;

    let matches = textToProcess.match(regex);

    for(let word of matches){
        word = word.replace('#','')
        console.log(word);
    }

}