<template lang="">
  <div>
    <h1>{{ siteInfo.siteName }}</h1>
    <a :href="siteInfo.siteUrl">{{ siteInfo.siteName }} 링크</a>
    <h2>방문여부 : {{ siteInfo.visited }}</h2>
    <hr />
  </div>
</template>
<script>
export default {
  name: 'PropsList2',
  props: ['siteInfo'],
};
</script>

<style lang=""></style>
