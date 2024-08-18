function getCats(array) {
    let cats = [];

    class Cat {
        constructor(name, age) {
            this.name = name;
            this.age = age;
        }

        meow() {
            console.log(`${this.name}, age ${this.age} says Meow`);
        }
    }

    for (let index = 0; index < array.length; index++) {
        const catInfo = array[index].split(" ");
        const [name, age] = catInfo;
        const newCat = new Cat(name, age);
        newCat.meow();
        cats.push(newCat);
    }
}

