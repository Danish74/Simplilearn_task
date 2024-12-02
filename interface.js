var Demo = /** @class */ (function () {
    function Demo() {
    }
    Demo.prototype.send = function (email) {
        console.log('send email from this email ' + email);
        return true;
    };
    Demo.prototype.queue = function (email) {
        console.log('this email is queued inside the list with the id' + email);
        return true;
    };
    Demo.prototype.receive = function (email) {
        console.log('email is received from this id ' + email);
        return true;
    };
    return Demo;
}());
var r = new Demo();
r.queue('admin@gmail.com');
r.receive('admin@gmail.com');
r.send('admin@gmail.com');
