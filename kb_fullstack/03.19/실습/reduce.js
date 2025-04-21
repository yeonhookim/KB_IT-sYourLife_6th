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
//acc -누산기
//cur - 현재값

// const sumId = classArr.reduce(function (acc, cur, index) {
//   return (acc += cur.id);
// }, 0);
// // 0으로 초깃값을 정해줘야함
// console.log('🚀 ~ sumId ~ sumId:', sumId);

// const longId = classArr.reduce(function (acc, cur, index) {
//   return (acc += cur.name);
// }, '');
// //초기화는 중요 문자열은 ''로 쓰는 거
// //reduce는 초깃값이 중요함
// console.log('🚀 ~ longId ~ longId:', longId);

const oddFt = classArr.reduce(function (acc, cur, idx) {
  if (cur.id % 2 === 1) {
    acc.push(cur);
  }
  return acc;
}, []);
console.log('🚀 ~ oddFt ~ oddFt:', oddFt);
// 배열형태이기 때문에 []로(빈배열) 초기화

// if (cur.id % 2 === 1) return acc.push(cur);
// // 이러면 acc.push(cur)전체가 리턴이 된다.
