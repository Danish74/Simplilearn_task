var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Vehicle = /** @class */ (function () {
    function Vehicle(name, capacity) {
        this.capacity = 4000;
        this.name = name;
        this.capacity = capacity;
    }
    Vehicle.prototype.startEngine = function () {
        console.log('Vehicle name is ' + this.name + ' and capacity =  ' + this.capacity);
    };
    Vehicle.prototype.stopEngine = function () {
        console.log(' ' + this.name + ' can start and has a capacity of ' + this.capacity);
    };
    Vehicle.prototype.run = function () {
        console.log(' ' + this.name + ' can run on manual Mode.');
    };
    Vehicle.prototype.brake = function () {
        console.log(' ' + this.name + ' can brake.');
    };
    Vehicle.prototype.printDetails = function () {
        console.log('name ' + this.name);
        console.log('capacity ' + this.capacity);
    };
    return Vehicle;
}());
var TwoWheeler = /** @class */ (function (_super) {
    __extends(TwoWheeler, _super);
    function TwoWheeler(name, capacity, tyre, engine) {
        var _this = _super.call(this, name, capacity) || this;
        _this.tyre = tyre;
        _this.engine = engine;
        return _this;
    }
    TwoWheeler.prototype.printDetails = function () {
        _super.prototype.printDetails.call(this);
        console.log("Tyre: ".concat(this.tyre));
        console.log("Engine: ".concat(this.engine));
    };
    return TwoWheeler;
}(Vehicle));
var ThreeWheeler = /** @class */ (function (_super) {
    __extends(ThreeWheeler, _super);
    function ThreeWheeler(name, capacity, tyre, engine) {
        var _this = _super.call(this, name, capacity) || this;
        _this.tyre = tyre;
        _this.engine = engine;
        return _this;
    }
    ThreeWheeler.prototype.printDetails = function () {
        _super.prototype.printDetails.call(this);
        console.log("Tyre: ".concat(this.tyre));
        console.log("Engine: ".concat(this.engine));
    };
    return ThreeWheeler;
}(Vehicle));
var twoWheeler = new TwoWheeler('Bike', 300000, 2, 1);
var threeWheeler = new ThreeWheeler('Auto', 600000, 3, 1);
twoWheeler.startEngine();
twoWheeler.run();
twoWheeler.brake();
twoWheeler.printDetails();
threeWheeler.startEngine();
threeWheeler.run();
threeWheeler.brake();
threeWheeler.printDetails();
