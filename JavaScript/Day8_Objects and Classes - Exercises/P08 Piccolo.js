function solve(input) {

    let parkingLot = [];

    for (const car of input) {

        let [direction, number] = car.split(', ');

        if (direction === 'IN' && !parkingLot.includes(number)) {
            parkingLot.push(number);
        } else if (direction === 'OUT' && parkingLot.includes(number)) {
            let index = parkingLot.indexOf(number);
            parkingLot.splice(index, 1);
        }
    }
    if (parkingLot.length > 0) {
        let sortedNumbers = parkingLot.sort((a, b) => a.localeCompare(b));

        sortedNumbers.forEach(n => console.log(n));
    } else {
        console.log('Parking Lot is Empty');
    }
}