var fruits1 = [123,'PINEAPPLE','BANANA'];

    fruits1.forEach(function(value,index){

        console.log(value);
    });


    var fruits1 = [123,'PINEAPPLE','BANANA'];

    fruits1.forEach(function(value,index){
         console.log(index,value);
     });
    
     var fruits4 = [123,'PINEAPPLE',true,null,undefined];

     fruits4.forEach(function(value,index){
         console.log(value);  
     });


     var fruits5 = ["Mango",25,true,null,256,"Parrot",false];
   
     fruits5.forEach(function(value){
           console.log(value);
     });  

     var fruits5 = ["Mango",25,true,null,256,"Parrot",false];
   
     fruits5.forEach(function(value,index){
           
        if(index===(fruits5.length-1)/2){
            return;
        }
            console.log(value);
     });  


     var fruits10 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     fruits10.forEach(function(index,value){
           console.log(index,value);
     }); 


     var fruits11 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     fruits11.forEach(function(index,value){
           console.log(value,"For each");
     });

     var fruits12 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     fruits12.forEach(function(index,value){
      console.log("For each",value);
     });

     var fruits13 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     fruits13.forEach(function(index,value){
      console.log("For each",index);
     });


     var items=[{
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


      items.forEach(function(value,index){

       console.log("value=",value);
       console.log("index",index);
      })
     
     var fruits11 = ["Boeing","Fly Emirates","Jet Airways","Spice Jet"];

     fruits11.forEach(function(index,value){

          if(index==4){
            break;
          }
          console.log(value);
     }); 