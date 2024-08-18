class Vehicle {
    constructor(type, model, parts, fuel) {
        this.type = type;
        this.model = model;
        this.parts = {
            engine: parts.engine,
            power: parts.power,
            quality: parts.power * parts.engine
        };
        this.fuel = fuel;
    }

    drive(fuelLose){
        this.fuel -= fuelLose;
    }
}