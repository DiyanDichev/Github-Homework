function solve(words, text) {

    let wordsArr = words.split(', ');
    let textArr = text.split(' ');

    for (let i = 0; i < wordsArr.length; i++){

        for (let j = 0; j < textArr.length; j++) {
            let isMatch = textArr[j].includes('*') && 
            textArr[j].length === wordsArr[i].length;

            if (isMatch){
                    textArr[j] =  wordsArr[i];
            }
        }
    }

    console.log(textArr.join(' '));
}