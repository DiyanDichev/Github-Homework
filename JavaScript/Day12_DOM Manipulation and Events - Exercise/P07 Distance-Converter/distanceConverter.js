function attachEventsListeners() {

    let [inputDistanceField,convertButton,  outputDistanceField] = document.getElementsByTagName('input');
    let [inputUnitOption, outputUnitOption] = document.getElementsByTagName('select');

    let convertionRates = {
        'km': 1000,
        'm': 1,
        'cm': 0.01,
        'mm': 0.001,
        'mi': 1609.34,
        'yrd': 0.9144,
        'ft': 0.3048,
        'in': 0.0254,
    };

    convertButton.addEventListener('click',()=> {

        let inputDistance = inputDistanceField.value;
        let inputUnits = inputUnitOption.value;
        let outputUnits = outputUnitOption.value;

        let result = inputDistance * convertionRates[inputUnits] / convertionRates[outputUnits];
        outputDistanceField.value = result;

        });
}