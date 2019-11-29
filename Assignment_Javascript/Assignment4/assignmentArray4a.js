console.log("======Array Methods========");



const fruits1 = [123,'PINEAPPLE','BANANA'];
console.log(Array.isArray(fruits1));

const fruits4 = [123,'PINEAPPLE',true,null,undefined];
console.log(Array.isArray(fruits4));

const fruits5 = ["Mango",25,true,null,256,"Parrot",false];
console.log(Array.isArray(fruits5));

const fruits10 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
console.log(Array.isArray(fruits10));

const items=[{
    item:'BMW',
    id:1,
    price:5000000,
    },
    {
    item :'AUDI',
    id : 2,
    price : 10000000,
    },

    {
    item : "PULSAR",
    id : 3,
    price : 100000,
    },

    {
    item : "GTR",
    id : 4,
    price : 5000000,
    }]

console.log(Array.isArray(items));


const items1=[{
    item:'TRON',
    id:1,
    price:5000000,
    },{

    item :'TREE',
    id : 2,
    price : 10000000,

    },{

    item : "REDBULL",
    id : 3,
    price : 100000,
    },{

    item : "WATCH",
    id : 4,
    price : 5000000,
    }]
    
console.log(Array.isArray(items1));

const items2=[{
    item:'PERK',
    id:1,
    price:5000000,
    },{

    item :'DAIRY MILK',
    id : 2,
    price : 10000000,
            
    },{

    item : "GEMS",
    id : 3,
    price : 100000,
           
    },{

    item : "CANDY MAN",
    id : 4,
    price : 5000000,
            
    }]
        
console.log(Array.isArray(items2));

var items3=[{
    
    item:'JASMINE',
    id:1,
    price:5000000,
                
    },{

    item :'LILY',
    id : 2,
    price : 10000000

    },{

    item : "SUN FLOWER",
    id : 3,
    price : 100000,

    },{

    item : "JARBERA",
    id : 4,
    price : 5000000,

    }]
            
console.log(Array.isArray(items3));

const fruits8 = ["BANANA",24,true,null,285,"PEACOCK",false];
console.log(Array.isArray(fruits8));

const fruits9 = ["COIN",20,null,"Parrot",true];
console.log(Array.isArray(fruits9));

console.log("====INCLUDES=====");

const fruits11 = [123,'PINEAPPLE','BANANA'];
console.log(fruits11.includes("PINEAPPLE"));
       
const fruits12 = [123,'PINEAPPLE',true,null,undefined];
console.log(fruits12.includes(null,1));
       
const fruits13 = ["Mango",25,true,null,256,"Parrot",false];
console.log(fruits13.includes(256,2));
       
const fruits14 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
console.log(fruits14.includes("SPICE JET"));
       
const items4=[{

    item:'BMW',
    id:1,
    price:5000000,
           
    },{

    item:'AUDI',
    id : 2,
    price : 10000000,

    },{

    item: "PULSAR",
    id : 3,
    price : 100000,

    },{

    item: "GTR",
    id : 4,
    price : 5000000,
    
    }]
    
const tree = items4.map(function(i1,index){
    if(i1.price===170){
        let price = items4.includes(i1);
        console.log('Contains',price)
    }
})
           
const items5=[{

    item:'TRON',
    id:1,
    price:5000000,
               
    },{

    item :'TREE',
    id : 2,
    price : 10000000,

    },{

    item : "REDBULL",
    id : 3,
    price : 100000,
    
    },{

    item : "WATCH",
    id : 4,
    price : 5000000,
               
    }]
           
console.log(items5.includes("RED BULL"));
       
const items6=[{

    item:'PERK',
    id:1,
    price:5000000,
    
    },{

    item :'DAIRY MILK',
    id : 2,
    price : 10000000,

    },{

    item : "GEMS",
    id : 3,
    price : 100000,

    },{

    item : "CANDY MAN",
    id : 4,
    price : 5000000,

    }]
               
console.log(items6.includes("GEMS",1));
       
var items7=[{

    item:'JASMINE',
    id:1,
    price:5000000,
                       
    },{

    item :'LILY',
    id : 2,
    price : 10000000,
    
    },{

    item : "SUN FLOWER",
    id : 3,
    price : 100000,

    },
                   
    {

    item : "JARBERA",
    id : 4,
    price : 5000000,
    
    }]
                   
console.log(items7.includes(items7[0].item,1));
       
const fruits15 = ["BANANA",24,true,null,285,"PEACOCK",false];
console.log(fruits15.includes(24,4));
       
const fruits16 = ["COIN",20,null,"Parrot",true];
console.log(fruits16.includes(null,1));


                       
console.log("================PUSH===================");

const fruits17 = [123,'PINEAPPLE','BANANA'];
fruits17.push("tron");
console.log(fruits17);
                       
const fruits18 = [123,'PINEAPPLE',true,null,undefined];
fruits18.push("tron","tree");
console.log(fruits18);
                       
const fruits19 = ["Mango",25,true,null,256,"Parrot",false];
fruits19.push("tron","tree");
console.log(fruits19);
                       
const fruits20 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
fruits20.push("tron","tree");
console.log(fruits20);

const fruits21 = ["BANANA",24,true,null,285,"PEACOCK",false];
fruits21.push("tron","tree");
console.log(fruits21);
                       
const fruits22 = ["COIN",20,null,"Parrot",true];
fruits22.push("tron","tree");
console.log(fruits22);

const items8=[{
    
    item:'BMW',
    id:1,
    price:5000000,
    
    },{

    item:'AUDI',
    id : 2,
    price : 10000000,
    
    },{

    item: "PULSAR",
    id : 3,
    price : 100000,
    
     },{

    item: "GTR",
    id : 4,
    price : 5000000,

    }]
                    
items8.push("tron",5,500);
console.log(items8);

const items9=[{

    item:'TRON',
    id:1,
    price:5000000,
    
    } ,{
      
    item :'TREE',
    id : 2,
    price : 10000000,

    },{

    item : "REDBULL",
    id : 3,
    price : 100000,
                               
    },{

    item : "WATCH",
    id : 4,
    price : 5000000,
    
    }]

items9.push("tron",5,500);
console.log(items9);
                       
const items10=[{
           
    item:'PERK',
    id:1,
    price:5000000,

    },{
    
    item :'DAIRY MILK',
    id : 2,
    price : 10000000,
    
    },{

    item : "GEMS",
    id : 3,
    price : 100000,
                                   
    },{
                        
    item : "CANDY MAN",
    id : 4, 
    price : 5000000,

    }]
                               
items10.push("tron",5,500);
console.log(items10);

var items11=[{

    item:'JASMINE',
    id:1,
    price:5000000,
                                       
    },{

    item :'LILY',
    id : 2,
    price : 10000000,
                                       
    },{
       
    item : "SUN FLOWER",
    id : 3,
    price : 100000,
    
    },{

    item : "JARBERA",
    id : 4,
    price : 5000000,

    }]
                                   
items11.push("tron",5,500);
console.log(items11);

console.log("================POP========================");

const fruits23 = [123,'PINEAPPLE','BANANA'];
fruits23.pop();
console.log(fruits23);
                       
const fruits24 = [123,'PINEAPPLE',true,null,undefined];
fruits24.pop();
fruits24.pop();
console.log(fruits24);
                       
const fruits25 = ["Mango",25,true,null,256,"Parrot",false];
fruits25.pop();
console.log(fruits25);
                       
const fruits26 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
fruits26.pop();
console.log(fruits26);

const fruits27 = ["BANANA",24,true,null,285,"PEACOCK",false];
fruits27.pop();
console.log(fruits27);

const fruits28 = ["COIN",20,null,"Parrot",true];
fruits28.pop();
console.log(fruits28);

const items16=[{
   item:'BMW',
   id:1,
   price:5000000,
},{

item:'AUDI',
id : 2,
price : 10000000,

},{

    item: "PULSAR",
    id : 3,
    price : 100000,
    
    },{
      
    item: "GTR",
    id : 4,
    price : 5000000,
    
    }]
                    
    items16.pop();
    console.log(items16);

    const items12=[{
    item:'TRON',
    id:1,
    price:5000000,

    },{
                               
    item :'TREE',
    id : 2,
    price : 10000000,
    
    },
                           
    {
    
    item : "REDBULL",
    id : 3,
    price : 100000,
     
    },{

    item : "WATCH",
    id : 4,
    price : 5000000,
     
    }]
                           
    items12.pop();
    console.log(items12);
                       
    const items13=[{
            
    item:'PERK',
    id:1,
    price:5000000,
     
    },{

    item :'DAIRY MILK',
    id : 2,
    price : 10000000,

    },{
      
    item : "GEMS",
    id : 3,
    price : 100000,

    },{

    item : "CANDY MAN",
    id : 4,
    price : 5000000,

    }]
                               
items13.pop();
console.log(items13);

const items14=[{

    item:'JASMINE',
    id:1,
    price:5000000,
     
    },{
                                      
    item :'LILY',
    id : 2,
    price : 10000000,
                                       
    },
                                   
    {
    
    item : "SUN FLOWER",
    id : 3,
    price : 100000,

    },{

    item : "JARBERA",
    id : 4,
    price : 5000000,
     
    }]
                                   
    items14.pop();
    console.log(items14);

console.log("================unshift==========================");

const fruits29 = [123,'PINEAPPLE','BANANA'];
fruits29.unshift("singing","reading");
console.log(fruits29);
fruits29.shift();
console.log(fruits29);
                                        
const fruits30 = [123,'PINEAPPLE',true,null,undefined];
fruits30.unshift("singing","reading");
console.log(fruits30);
fruits30.shift();
console.log(fruits30);
                                       
const fruits31 = ["Mango",25,true,null,256,"Parrot",false];
fruits31.unshift("singing","reading");
console.log(fruits31);
fruits31.shift();
console.log(fruits31);
                                       
const fruits32 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
fruits32.unshift("singing","reading");
console.log(fruits32);
fruits32.shift();
console.log(fruits32);
                
const fruits33 = ["BANANA",24,true,null,285,"PEACOCK",false];
fruits33.unshift("singing","reading");
console.log(fruits33);
fruits33.shift();
console.log(fruits33);
                
const fruits34 = ["COIN",20,null,"Parrot",true];
fruits34.unshift("singing","reading");
console.log(fruits34);
fruits34.shift();
console.log(fruits34);

const items17=[{
                                       
    item:'BMW',
    id:1,
    price:5000000,
    
    },{

    item:'AUDI',
    id : 2,
    price : 10000000,
    
    },{
      
    item: "PULSAR",
    id : 3,
    price : 100000,
    
    },{

    item: "GTR",
    id : 4,
    price : 5000000,
    
    }]
                                 
    items17.unshift("singing",5,20000,"reading",6,50000);
    console.log(items17);
    items17.shift();
    console.log(items17);
             
const items18=[{
                                            
    item:'TRON',
    id:1,
    price:5000000,
    
    },{

    item :'TREE',
    id : 2,
    price : 10000000,
    
    },{
      
    item : "REDBULL",
    id : 3,
    price : 100000,
                                            
    },{

    item : "WATCH",
    id : 4,
    price : 5000000,
                                            
    }]
                                        
items18.unshift("singing",5,20000,"reading",6,50000);
console.log(items18);
items18.shift();
console.log(items18);

const items19=[{
                            
    item:'PERK',
    id:1,
    price:5000000,
     
    },{

    item :'DAIRY MILK',
    id : 2,
    price : 10000000,
     
    },{
                                   
    item : "GEMS",
    id : 3,
    price : 100000,
          
    },{

    item : "CANDY MAN",
    id : 4,
    price : 5000000,
    
    }]
                                            
items19.unshift("singing",5,20000,"reading",6,50000);
console.log(items19);
items19.shift();
console.log(items19);

var items20=[{
    item:'JASMINE',
    id:1,
    price:5000000,
    },
    {
    item :'LILY',
    id : 2,
    price : 10000000,
    },

    {
    item : "SUN FLOWER",
    id : 3,
    price : 100000,
    },

    {
    item : "JARBERA",
    id : 4,
    price : 5000000,
    }]

    items20.unshift("singing",5,20000,"reading",6,50000);
    console.log(items20);
    items20.shift();
    console.log(items20);
                                               

console.log("==================splice&slice===========================");
                                       

const fruits35 = [123,'PINEAPPLE','BANANA'];
const red1 = fruits35.splice(1,2,"singing","reading");
console.log(red1);
const red2=fruits35.slice(1,2)
console.log(red2);
                                        
const fruits36 = [123,'PINEAPPLE',true,null,undefined];
const red3=fruits36.splice(2,1,"singing","reading");
console.log(red3);
const red4 = fruits36.slice(2,3)
console.log(red4);
                                       
const fruits37 = ["Mango",25,true,null,256,"Parrot",false];
const red5 = fruits37.splice(1,0,"singing","reading");
console.log(red5);
const red6=fruits37.slice(1,2);
console.log(red6);
                                       
const fruits38 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
const red7 = fruits38.splice(0,2);
console.log(red7);
const red8 = fruits38.slice(1,2)
console.log(red8);
                
const fruits39 = ["BANANA",24,true,null,285,"PEACOCK",false];
const red9 = fruits39.splice(1,2,"singing","reading");
console.log(red9);
const red10 = fruits39.slice(1,2);
console.log(red10);

                
const fruits40 = ["COIN",20,null,"Parrot",true];
const red11 = fruits40.splice();
console.log(red11);
const red12 = fruits40.slice(1,2)
console.log(red12);

const items21=[{
                                           
    item:'BMW',
    id:1,
    price:5000000,
    
    },{

    item:'AUDI',
    id : 2,
    price : 10000000,
    
    },{
        
    item: "PULSAR",
    id : 3,
    price : 100000,
    
    },{
       
     item: "GTR",
    id : 4,
    price : 5000000,
                                            
    }]
                                     
const red20 = items21.splice(1,2,"singing",5,20000,"reading",6,50000);
console.log(red20);
const red21 = items21.slice(1,3);
console.log(red21);
                 
const items22=[{
                                                
    item:'TRON',
    id:1,
    price:5000000,
    
    },{

    item :'TREE',
    id : 2,
     price : 10000000,
                                                
    },{
    
    item : "REDBULL",
    id : 3,
    price : 100000,
    
    },{

    item : "WATCH",
    id : 4,
    price : 5000000,
    
    }]
                                            
const red22 = items22.splice(1,2,"singing",5,20000,"reading",6,50000);
console.log(red22);
const red23 = items22.slice(1,3);
console.log(red23);
 
const items23=[{

    item:'PERK',
    id:1,
    price:5000000,
    
    }, {

    item :'DAIRY MILK',
    id : 2,
     price : 10000000,
    
    },{

    item : "GEMS",
     id : 3,
    price : 100000,
                   
    }, {
       
    item : "CANDY MAN",
    id : 4,
    price : 5000000,
                                                    
}]
                                                
const red24= items23.splice(1,2,"singing",5,20000,"reading",6,50000);
console.log(red24);
const red25=items23.slice(1,3);
console.log(red25);
 
var items24=[{
    
    item:'JASMINE',
    id:1,
     price:5000000,
    
    },{

    item :'LILY',
    id : 2,
    price : 10000000,

    },
    {
    item : "SUN FLOWER",
    
    id : 3,
    price : 100000,
    },

    {
    item : "JARBERA",
    id : 4,
    price : 5000000,
    }]

const red26=items24.splice(1,2,"singing",5,20000,"reading",6,50000);
console.log(red26);
const red27=items24.slice(1,3);
console.log(red27);

console.log("====================indexof============================");

const fruits41 = [123,'PINEAPPLE','BANANA'];
console.log (fruits35.indexOf("PINEAPPLE",0));


const fruits42 = [123,'PINEAPPLE',true,null,undefined];
console.log (fruits42.indexOf("PINEAPPLE",0));

const fruits43 = ["Mango",25,true,null,256,"Parrot",false];
console.log (fruits43.indexOf(25,0));

const fruits44 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];
console.log (fruits44.indexOf("Spice jet",0));


const fruits45 = ["BANANA",24,true,null,285,"PEACOCK",false];
console.log (fruits45.indexOf("PINEAPPLE",0));


const fruits46 = ["COIN",20,null,"Parrot",true];
console.log (fruits46.indexOf(true,0));

const fruits57 = ["COIN",20,null,"Parrot",true];
console.log (fruits57.indexOf(true,0));

const fruits58 = [20,null,"Parrot",true];
console.log (fruits57.indexOf(true,3));

const fruits59 = ["COIN",20,null,"Parrot",true];
console.log (fruits59.indexOf(20,0));

const fruits60 = ["COIN",20,289,null,"Parrot",true];
console.log (fruits60.indexOf(289,2));

const fruits61 = ["COIN",20,null,"Parrot",true];
console.log (fruits61.indexOf(null,4));



console.log("=================join=========================");

const fruits47 = [123,'PINEAPPLE','BANANA'];
const String1 = fruits47.join('-');
console.log(String1);    
                                                     
const fruits48 = [123,'PINEAPPLE',true,null,undefined];
const String2 = fruits48.join('-');
console.log(String2); 

const fruits49 = ["Mango",25,true,null,256,"Parrot",false];
const String3 = fruits49.join('-');
console.log(String3);

const fruits50 = ["Mango",300,null,256,"Parrot",false];
const String4 = fruits50.join('*');
console.log(String4);

const fruits51 = ["Mango",256,"Parrot",false];
const String5 = fruits51.join('-');
console.log(String5);

const fruits52 = ["Mango",25,true,null,256,"Parrot",false];
const String6 = fruits52.join('*');
console.log(String6);

const fruits53 = [true,null,256,"Parrot",false];
const String7 = fruits53.join('=');
console.log(String7);

const fruits54 = ["Mango",25,true,null,256,"Parrot",false];
const String8 = fruits54.join('->');
console.log(String8);

const fruits55 = ["Mango",25,300,"Parrot",false];
const String9 = fruits55.join('-');
console.log(String9);

const fruits56 = ["Mango",25,"indigo",300,"Parrot",false];
const String10 = fruits56.join('-');
console.log(String10);

                                                                                                          
                                                    

                                                     
                                                     
                                      
                                                       
                       
                                       
                                           
                                                       
                                
                                                       