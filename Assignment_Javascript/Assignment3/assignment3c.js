var brands=["Aqua","Bisleri","RailWater","Kingfisher"];

     for(var element of brands){
      console.log('Brands=',element);
      }

     var fruits1 = [123,'PINEAPPLE','BANANA'];

     for(var element of fruits1){
      console.log(element);
     }

     var fruits4 = [123,'PINEAPPLE',true,null,undefined];
      
     for(var element of fruits4){
      console.log(element);
     }

     var fruits5 = ["Mango",25,true,null,256,"Parrot",false];
     
     for(var element of fruits5){
         if(element==null)
         {
             break;
         }

         console.log(element);      
     }

     var fruits10 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     for(var element of fruits10){     
        console.log(element);  
     } 

     var fruits10 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     for(var element of fruits10){ 
         
        if(element===undefined){
            continue;
        }
        console.log(element);  
     } 


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


      for(var element of items){ 
         
        console.log(element);  
      } 

      var items1=[{
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
      item : "TREE",
      id : 3,
      price : 100000,
      },

      {
      item : "TRON",
      id : 4,
      price : 5000000,
      }]

      for(var element of items1){ 
        if(element==items1[2]){     
        console.log(element);  
         }
      } 

      var items2=[{
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
      item : "TREE",
      id : 3,
      price : 100000,
      },

      {
      item : "TRON",
      id : 4,
      price : 5000000,
      }]

      for(var element of items2){ 
        if(element==items2[3]){     
            break;
         }
         else{
             console.log(element);
         }
      } 

     var fruits11 = ["Boeing","Fly Emirates",,"Jet Airways","Spice Jet"];

     for(var element of fruits11){
         if(element==fruits11[2]){     
        console.log(element);  
         }
     } 