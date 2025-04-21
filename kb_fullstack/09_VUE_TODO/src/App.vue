<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<template>
  <nav>
    <RouterLink to="/">Home</RouterLink>
    /
    <RouterLink to="/login">Login</RouterLink>
    /
    <RouterLink to="/todo">Todo</RouterLink>
    /
    <RouterLink to="/pinia">Pinia</RouterLink>
    /
    <RouterLink to="/pinia">Pinia1</RouterLink>
  </nav>
  <RouterView />
</template>
