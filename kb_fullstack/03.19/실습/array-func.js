const classArr = [
  { id: 1, name: '안은현' },
  { id: 2, name: '강병현' },
  { id: 3, name: '염다빈' },
  { id: 4, name: '권다연' },
  { id: 5, name: '이혜원' },
  { id: 6, name: '김은지' },
  { id: 7, name: '이준범' },
  { id: 8, name: '김지민' },
  { id: 9, name: '김연후' },
  { id: 10, name: '강수민' },
  { id: 11, name: '김보성' },
  { id: 12, name: '양서진' },
  { id: 13, name: '장현지' },
  { id: 14, name: '최재원' },
  { id: 15, name: '채수정' },
  { id: 16, name: '유예원' },
  { id: 17, name: '최예빈' },
  { id: 18, name: '전규진' },
  { id: 19, name: '강민재' },
  { id: 20, name: '김어진' },
  { id: 21, name: '김영오' },
  { id: 22, name: '서승준' },
  { id: 23, name: '이호진' },
  { id: 24, name: '김희주' },
  { id: 25, name: '곽효재' },
  { id: 26, name: '유수상' },
  { id: 27, name: '김서연' },
  { id: 28, name: '안태현' },
];

// const findIndex = classArr.findIndex(function (student, index) {
//   //(el, idx)
//   console.log(student, index);
//   return student.name === '김연후';
// });
// console.log('🚀 ~ findIndex ~ findIndex:', findIndex);

// const findIndex2 = classArr.findIndex(
//   (student, index) => student.name === '김연후'
// );
// console.log('🚀 ~ findIndex2:', findIndex2);

// const overIdTenArr = classArr.filter(function (student, index) {
//   return student.id >= 10; // 수강생의 id가 10 이상
// });
// console.log('🚀 ~ overIdTenArr ~ overIdTenArr:', overIdTenArr);

// //축약 버전

// const overIdTenArr2 = classArr.filter((student, index) => student.id >= 10);
// console.log('🚀 ~ overIdTenArr2:', overIdTenArr2);

//홀수
const overIdHol = classArr.filter(function (student, index) {
  return student.id % 2 != 0;
});
// return student.id% 2 ===1;
console.log('🚀 ~ overIdHol ~ overIdHol:', overIdHol);

//짝수
const overIdJjag = classArr.filter((student, index) => student.id % 2 == 0);
// return student.id % 2 ===0;
console.log('🚀 ~ overIdJjag:', overIdJjag);
