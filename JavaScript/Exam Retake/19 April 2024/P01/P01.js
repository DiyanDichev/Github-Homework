function decodeSpell(spell) {
    let command;

    while ((command = prompt("Enter command:")) !== "End") {
        let parts = command.split('!');
        let action = parts[0];

        switch (action) {
            case "RemoveEven":
                spell = spell.split('').filter((_, index) => index % 2 === 0).join('');
                console.log(spell);
                break;

            case "TakePart":
                let fromIndex = parseInt(parts[1]);
                let toIndex = parseInt(parts[2]);
                spell = spell.substring(fromIndex, toIndex);
                console.log(spell);
                break;

            case "Reverse":
                let substring = parts[1];
                if (spell.includes(substring)) {
                    spell = spell.replace(substring, '');
                    let reversedSubstring = substring.split('').reverse().join('');
                    spell = spell + reversedSubstring;
                    console.log(spell);
                } else {
                    console.log("Error");
                }
                break;

            default:
                console.log("Invalid command!");
                break;
        }
    }
}

let initialSpell = prompt("Enter the initial spell:");
decodeSpell(initialSpell);
