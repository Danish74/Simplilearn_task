class Vehicle{
    private capacity = 4000; 
    private name:string;

    constructor(name:string, capacity:number)
    {
        
        this.name = name;
        this.capacity = capacity;
    }

    startEngine(){
        console.log('Vehicle name is ' + this.name + ' and capacity =  ' + this.capacity);
    }


    stopEngine(){
            console.log(' ' + this.name + ' can start and has a capacity of ' + this.capacity);
        }
  
   

    run(){
        console.log(' ' + this.name + ' can run on manual Mode.');
    }

    brake() {
        console.log(' ' + this.name + ' can brake.');
    }

  
  printDetails(){
    console.log('name ' + this.name);
    console.log('capacity ' + this.capacity);
  }
}


class TwoWheeler extends Vehicle {
  private tyre: number;
  private engine: number;

  constructor(name: string, capacity: number, tyre: number, engine: number) {
    super(name, capacity);
    this.tyre = tyre;
    this.engine = engine;
  }

 
  printDetails(): void {
    super.printDetails();
    console.log(`Tyre: ${this.tyre}`);
    console.log(`Engine: ${this.engine}`);
  }
}


class ThreeWheeler extends Vehicle {
  private tyre: number;
  private engine: number;

  constructor(name: string, capacity: number, tyre: number, engine: number) {
    super(name, capacity);
    this.tyre = tyre;
    this.engine = engine;
  }


  printDetails(){
    super.printDetails();
    console.log(`Tyre: ${this.tyre}`);
    console.log(`Engine: ${this.engine}`);
  }
}


const twoWheeler = new TwoWheeler('Bike', 300000, 2, 1);
const threeWheeler = new ThreeWheeler('Auto', 600000, 3, 1);

twoWheeler.startEngine();
twoWheeler.run();
twoWheeler.brake();
twoWheeler.printDetails();

threeWheeler.startEngine();
threeWheeler.run();
threeWheeler.brake();
threeWheeler.printDetails();