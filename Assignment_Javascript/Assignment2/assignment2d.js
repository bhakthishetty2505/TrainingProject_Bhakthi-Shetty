function electro(num)
       { 
           var count=0;
           var count1=0;
        
           for(var i=1; i<num; i++)
           {
               if(num%i == 0)
               {
                  console.log("Not Prime");
                  break;
               }
               else
               {
                   console.log("Prime");
                   break;
               }
           }
       }

       electro(21);

       var out=function (num)
       { 
        
           for(var i=2; i<num; i++)
           {
               if(num%i === 0)
               {
                  console.log("Not Prime");
                  break;
               }
               else
               {
                   console.log("Prime");
                   break;
               }
           }
       }

       out(13);

       var out=(function (num)
       { 
        
           for(var i=2; i<num; i++)
           {
               if(num%i === 0)
               {
                  console.log("Not Prime");
                  break;
               }
               else
               {
                   console.log("Prime");
                   break;
               }
           }
       })(47);

       var out1=(num)=>
       { 
        
           for(var i=2; i<num; i++)
           {
               if(num%i === 0)
               {
                  console.log("Not Prime");
                  break;
               }
               else
               {
                   console.log("Prime");
                   break;
               }
           }
       }
       
       out1(53);
