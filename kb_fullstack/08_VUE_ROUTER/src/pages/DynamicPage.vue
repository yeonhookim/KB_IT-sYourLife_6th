<template>
  <div>
    <h1>오늘의 기분은?? {{ msg }}</h1>
    <img v-bind:src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
const mood = computed(() => currentRoute.params.mood);
const msg = computed(() => (mood.value == 'happy' ? '행복합니다' : '씐나'));

const imgSrc = computed(() =>
  mood.value === 'happy'
    ? 'https://cdn.imweb.me/thumbnail/20240802/5bda555280db2.png'
    : 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCvJnYqULhmf2ziXJGcJNqBagkGpDsvOnvRA&s'
);
</script>

<style lang="scss" scoped></style>
