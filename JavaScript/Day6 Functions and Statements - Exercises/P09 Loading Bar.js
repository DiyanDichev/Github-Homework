function loadingBar(number) {

    if (number === 100) {
        console.log('100% Complete!');
    } else {
        let percentCount = '%'.repeat(number / 10);
        let dotsCount = ('.').repeat(10 - percentCount.length);

        console.log(`${number}% [${percentCount}${dotsCount}]`);
        console.log('Still loading...');
    }
}