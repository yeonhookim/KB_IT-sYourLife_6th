<!-- src/pages/CorsExPage.vue -->
<template>
  <div>
    <h1>CORS EX PAGE</h1>
  </div>
</template>

<script setup>
const API_URL =
  'https://port-0-tetz-night-back-m5yo5gmx92cc34bc.sel4.cloudtype.app';

//const PROXY_URL = '/api';
const PROXY_URL = '/cors-ex';
// '/cors/ex'vite.config.js에서 저렇게도 변경해서 가능
async function getCorsData() {
  try {
    const corsUrl = PROXY_URL;
    const res = await fetch(corsUrl);
    const data = await res.json();

    console.log('CORS 응답 데이터:', data);
  } catch (e) {
    alert('CORS 응답 통신 ERR 발생');
    console.log(e);
  }
}

getCorsData();
</script>

<style scoped></style>
