// setInterval(function () {
//   const rand = parseInt(Math.random() * 10);
//   // parseInt -> 소수점 버림
//   console.log('🚀 ~ rand:', rand);
//   if (rand > 5) return console.log('아싸 로또 사자!');
//   throw new Error('망했어요...');
// }, 2000);
// // 5이하가 나오면 에러가 뜨는 코드

setInterval(function () {
  try {
    const rand = parseInt(Math.random() * 10);
    console.log('🚀 ~ rand:', rand);
    if (rand > 5) return console.log('아싸 로또 사자!');
    throw new Error('망했어요 진짜 .. 인생 ...');
    // 에러가 예상되는 코드
  } catch (error) {
    console.error('🚀 ~ error:', error);
    console.log('한강 간당 ~~ 부럽지 ~~.');
    console.log('맥주에 치킨두 ~~');
    // 에러처리 코드
  }
}, 2000);
// 5이하가 나오면 에러가 뜨는 코드
