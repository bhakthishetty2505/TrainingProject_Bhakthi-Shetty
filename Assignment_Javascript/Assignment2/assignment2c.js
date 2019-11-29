var pi =Math.PI;
console.log(pi);

function f1(num)
{
    var res = 2 * Math.PI * num;
    console.log("Circumference=",res);
}

f1(6);

var tree = function(num)
{
    var res = 2 * Math.PI * num;
    console.log("Circumference=",res);
}

tree(6);

var tree = (function(num)
{
    var res = 2 * Math.PI *num;
    console.log("Circumference=",res);
})(6);


var tree1 = (num) =>
{
    var res = 2 * Math.PI * num;
    console.log("Circumference=",res);
}

tree1(6);
