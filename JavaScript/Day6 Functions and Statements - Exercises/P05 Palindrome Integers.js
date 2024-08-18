function palindromeNumbers(arr) {

    function isPalindrome(num) {
        let numAsString = num.toString();
        let reversedNum = numAsString.split('').reverse().join('');

        return numAsString === reversedNum;
    }

    for (const currentNumber of arr) {
        console.log(isPalindrome(currentNumber))
    }
}