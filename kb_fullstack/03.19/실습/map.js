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

// // const addedClassArr = classArr.map(function (el, idx) {

// const addedClassArr = classArr.map(function (student) {
//   return {
//     // id: el.id,
//     // name: el.name,
//     ...student,
//     condition: 'good',
//   };
// });
// console.log('🚀 ~ addedClassArr ~ addedClassArr:', addedClassArr);

// id가 홀수인 수강생은 id의 값을 곱하기2 더하기 1,
// id가 짝수인 수강생은 수강생 이름뒤에 (짝수번)을 추가
// const addedClassArr = classArr.map(function (el, idx) {
//   return el.id % 2 ===0,

// console.log('🚀 ~ addedClassArr ~ addedClassArr:', addedClassArr);

// }; 밑에가 찐
const edittedClassArr = classArr.map(function (el, idx) {
  if (el.id % 2 === 0) {
    return {
      ...el,
      name: el.name + '(짝수번)', //순서가 중요함 전개연산자는 상단에 먼저 써줘야함
    };
  } else {
    return {
      ...el,
      id: el.id * 2 + 1,
    };
  }
});
console.log('🚀 ~ edittedClassArr ~ edittedClassArr:', edittedClassArr);
