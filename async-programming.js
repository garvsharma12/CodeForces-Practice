console.log('start');


// setTimeout se hum delay de sakte hai ismao pehele start and end print ho jayega  then 5000ms baaad mid print hoga
setTimeout(()=>{
    console.log('mid')
},5000);

// it has trust issue just like girls 
//agar khali hogi window toh execute hoga nahi toh aage bad jayega aur fir baadmai print hoga
// 5000ms humara time limit hai
//setTimeout ek api hai browser ka


setInterval(()=>{
    console.log('hiiiiiiiiiiiiiiiiiiiii');
},2000);



console.log('end');