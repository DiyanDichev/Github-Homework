function superheroAlliance(input) {
    class Superhero {
        constructor(name, superpowers, energy) {
            this.name = name;
            this.superpowers = new Set(superpowers);
            this.energy = energy;
        }

        usePower(superpower, energyRequired) {
            if (this.superpowers.has(superpower) && this.energy >= energyRequired) {
                this.energy -= energyRequired;
                console.log(`${this.name} has used ${superpower} and now has ${this.energy} energy!`);
            } else {
                console.log(`${this.name} is unable to use ${superpower} or lacks energy!`);
            }
        }

        train(trainingEnergy) {
            if (this.energy < 100) {
                let energyGained = Math.min(100 - this.energy, trainingEnergy);
                this.energy += energyGained;
                console.log(`${this.name} has trained and gained ${energyGained} energy!`);
            } else {
                console.log(`${this.name} is already at full energy!`);
            }
        }

        learn(newSuperpower) {
            if (this.superpowers.has(newSuperpower)) {
                console.log(`${this.name} already knows ${newSuperpower}.`);
            } else {
                this.superpowers.add(newSuperpower);
                console.log(`${this.name} has learned ${newSuperpower}!`);
            }
        }

        printDetails() {
            console.log(`Superhero: ${this.name}`);
            console.log(` - Superpowers: ${[...this.superpowers].join(", ")}`);
            console.log(` - Energy: ${this.energy}`);
        }
    }

    const n = parseInt(input[0]);
    const superheroes = {};

    for (let i = 1; i <= n; i++) {
        let [name, superpowers, energy] = input[i].split('-');
        superheroes[name] = new Superhero(name, superpowers.split(','), parseInt(energy));
    }

    for (let i = n + 1; i < input.length; i++) {
        if (input[i] === "Evil Defeated!") break;

        const [command, ...args] = input[i].split(' * ');

        switch (command) {
            case 'Use Power':
                superheroes[args[0]].usePower(args[1], parseInt(args[2]));
                break;
            case 'Train':
                superheroes[args[0]].train(parseInt(args[1]));
                break;
            case 'Learn':
                superheroes[args[0]].learn(args[1]);
                break;
        }
    }

    for (let hero in superheroes) {
        superheroes[hero].printDetails();
    }
}


// Example usage:
const input = [
    "3",
    "Iron Man-Repulsor Beams,Flight-80",
    "Thor-Lightning Strike,Hammer Throw-10",
    "Hulk-Super Strength-60",
    "Use Power * Iron Man * Flight * 30",
    "Train * Thor * 20",
    "Train * Hulk * 50",
    "Learn * Hulk * Thunderclap",
    "Use Power * Hulk * Thunderclap * 70",
    "Evil Defeated!"

];

superheroAlliance(input);