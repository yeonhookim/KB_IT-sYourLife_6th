<script setup>
const obj = {
  name: '김연후',
  isOld: false,
};
localStorage.setItem('KYH', JSON.stringify(obj));
const getObj = JSON.parse(localStorage.getItem('KYH'));
// localStorage.setItem('spiderman', '스파이더맨');
//html은 window.을 붙여야 함
// // localStorage.removeItem('kyh');
// localStorage.clear();
// // const item = localStorage.getItem('name');
// const getObj = localStorage.getItem('KYH');

console.log(getObj);
console.log(getObj.name);
// console.log(item);
</script>

<template>
  <div>
    <h1>HOME</h1>
  </div>
</template>
