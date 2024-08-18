function solve(input) {

    input.forEach(employee => {

        const employeeName = employee;
        const personalNumber = employee.length;
        console.log(`Name: ${employeeName} -- Personal Number: ${personalNumber}`);
    });
}