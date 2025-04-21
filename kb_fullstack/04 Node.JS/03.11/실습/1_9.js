for (let i = 1; i < 10; i++) {
  if (i === 4) continue;
  for (let j = 1; j < 10; j++) {
    console.log(`${i} x ${j} = ${i * j}`);
  }
}
// <!-- //   while (let i = 0; j = 0; i<4; j<10; i++ j++){
//     //     console.log(${i} * ${j} = ${i}*${j} )
//     //   }

//     //     for (let i = 0; i<10; i++){
//     //       for(let j = 0; j<10; j++) {
//     //        console.log(i "*" j = i*j);
//     //       }
//     //   } -->
