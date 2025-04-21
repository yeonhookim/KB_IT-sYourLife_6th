<template>
  <div>
    <h1>강아지가 생기는 꿈을 꾸었습니다.</h1>
    <h1>Ref Data: {{ refData.name }}</h1>
    <h1>Reactive Data: {{ reactiveData.name }}</h1>
    <button v-on:click="changeRef">Ref Data 변경</button>
    <button v-on:click="changeReactive">Reactive Data 변경</button>
  </div>
</template>

<!-- Vue3 -->
<script setup>
import { ref, reactive } from 'vue';

const refData = ref({ name: '김연후' });
const reactiveData = reactive({ name: '김연후' });

const changeRef = function () {
  refData.value = { name: '차은우' };
};

const changeReactive = () => {
  reactiveData = { name: '차은우' };
};
// console.log('REF DATA', refData);
// console.log('REF DATA 의 value', refData.value);
// console.log('REF DATA 의 value 의 name', refData.value.name);
</script>
