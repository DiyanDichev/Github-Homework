function solve(arr) {

    let resultArray = [];
    let sortedArray = arr.sort((a, b) => a - b);
    let arrayLength = arr.length;

    for (let index = 0; index < arrayLength; index++) {


        if(index % 2 === 0){
            resultArray.push(sortedArray.shift())
        }else{
            resultArray.push(sortedArray.pop());
        }
    }
    return resultArray;
}