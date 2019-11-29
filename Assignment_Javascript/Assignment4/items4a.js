const items = [{
    name : "Ear Rings",
    id:1,
    price:5000
},{
    name:"kajal",
    id:2,
    price:1000
},{
    name:"Trimmer",
    id:3,
    price:3000
},{
    name:"Beardo",
    id:4,
    price:170
}]

const items1 = items.map(function(item,index){
    item.price = item.price + 300;
    return item;
})
console.log(items1);

const items2 = items.filter((item) =>item.price>1000)
console.log(items2);

const items3 = items.map((item)=>{
    item.price=item.price+300;
    return item;
})
console.log(items3);