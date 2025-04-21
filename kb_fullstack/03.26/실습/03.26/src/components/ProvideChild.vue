<template lang="">
  <div>
    <ProvideGrandChild :drilling="drilling" />
  </div>
</template>
<script>
import ProvideGrandChild from './ProvideGrandChild.vue';
export default {
  name: 'provideChild',
  props: ['drilling'],
  components: { ProvideGrandChild },
};
</script>
<style lang=""></style>
