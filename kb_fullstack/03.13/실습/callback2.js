function generateRandomNumber(callback) {
  console.log('숫자 생성 중...');

  setTimeout(() => {
    const randomNumber = Math.floor(Math.random() * 10) + 1;
    console.log(`생성된 숫자 : ${randomNumber}`);

    //     if (randNum >= 5) {
    //       console.log('통과');
    //     } else {
    //       console.log('탈락');
    //     }
    //   }, 1000);

    const reult = randomNumber >= 5 ? '통과' : '탈락';
    callback(randomNumber, result);
  }, 1000);
}
//   console.log('결과 확인 완료');
// }
generateRandomNumber((number, result) => {
  console.log(`결과 : ${result}`);
  console.log('결과 확인 완료!');
});

//비동기적 특징
