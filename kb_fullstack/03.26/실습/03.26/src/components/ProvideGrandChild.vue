<template lang="">
  <div>
    <h1>props : {{ drilling }}</h1>
    <h1>inject : {{ fly }}</h1>
  </div>
</template>
<script>
export default {
  name: 'provideGrandChild',
  props: ['drilling'],
  inject: ['fly'],
};
</script>
<style lang=""></style>
