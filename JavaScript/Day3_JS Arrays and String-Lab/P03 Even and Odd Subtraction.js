function evenAndSumOfSubtraction(arr) {
    let sumOfEvenNumbers = 0;
    let sumOfOddNumbers = 0;

    for (let index = 0; index < arr.length; index++) {
        const currentNumber = Number(arr[index]);
        const isEvenNumber = currentNumber % 2 === 0;

        if (isEvenNumber) {
            sumOfEvenNumbers += currentNumber;
        } else {
            sumOfOddNumbers += currentNumber;
        }
    }
    console.log(sumOfEvenNumbers - sumOfOddNumbers);
}