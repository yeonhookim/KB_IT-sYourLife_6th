<!-- <template>
  <div>
    <h1>{{ msg }}</h1>
    <QuizChild :randomNumber="randomNumber" v-on:send-msg="emitHandler" />
  </div>
</template>

<script setup>
import { ref, watch } from 'vue';
import QuizChild from './QuizChild.vue';

const msg = ref('랜덤 숫자를 맞춰 주세요.');
const randomNumber = ref(Math.floor(Math.random() * 21)); // 0 ~ 20 사이의 랜덤 숫자
const attemptCount = ref(0); // 시도 횟수 카운트

const emitHandler = (value) => {
  msg.value = value;
  attemptCount.value += 1; // 시도 횟수 증가
};

watch(attemptCount, (newValue) => {
  if (newValue === 3 && newValue !== 0) {
    alert(`${newValue}번째 시도입니다!`);
  }
});
</script>

<style lang="scss" scoped></style> -->
<template>
  <div>
    <h1>{{ msg }}</h1>
    <QuizChild :randNum="randNum" v-on:send-msg="emitHandler" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import QuizChild from './QuizChild.vue';
const rand = parseInt(Math.random() * 20);
const randNum = ref(rand);
const msg = ref('랜덤 숫자를 맞춰 주세요');

const emitHandler = (value) => {
  msg.value = value;
};
</script>

<style lang="scss" scoped></style>
