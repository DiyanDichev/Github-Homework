function sumOfOddAndEvenNumbers(number) {

    let numberAsString = number.toString();
    let oddSum = 0;
    let evenSum = 0;

    for (let index = 0; index < numberAsString.length; index++) {
        let digit = Number(numberAsString[index]);

        if (digit % 2 === 0) {
            evenSum += digit;
        } else {
            oddSum += digit;
        }

    }
    console.log(`Odd sum = ${oddSum}, Even sum = ${evenSum}`);
}