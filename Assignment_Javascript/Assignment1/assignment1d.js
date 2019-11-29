var fruits = new Array("APPLE","PINEAPPLE","BANANA");

var first=fruits[0];
var second=fruits[1];
var third = fruits[2];

console.log(first);
console.log(second);
console.log(third);

var fruits1 = new Array(123,"PINEAPPLE","BANANA");

console.log(fruits1[0]);
console.log(fruits1[1]);
console.log(fruits1[2]);

var fruits2 = new Array(123,'PINEAPPLE',true );
var first=fruits2[0];
var second=fruits2[1];
var third = fruits2[2];

console.log(first);
console.log(second);
console.log(third);

var fruits3 = new Array (123,'PINEAPPLE',true,null);

console.log(fruits3);

var fruits4 = new Array(123,'PINEAPPLE',true,null,undefined);

fruits4[8]=128;

console.log(fruits4[0]);
console.log(fruits4[1]);
console.log(fruits4[2]);
console.log(fruits4[3]);
console.log(fruits4[4]);
console.log(fruits4[5]);
console.log(fruits4[5]);
console.log(fruits4[7]);
console.log(fruits4[8]);