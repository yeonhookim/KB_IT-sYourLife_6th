<template>
  <div>
    <h1>TODO EDIT</h1>
    <div>
      <h2>todo : <input type="text" v-model.trim="editedTodo" /></h2>
      <h2>desc : <input type="text" v-model.trim="editedDesc" /></h2>
      <h2>done : <input type="checkbox" v-model.trim="editedDone" /></h2>
      <button>수정</button>
      <button>취소</button>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { RouterLink, useRoute, useRouter } from 'vue-router';

const router = useRouter();
const curRoute = useRoute();
const id = curRoute.params.id;
const BASE_URL = '/api';

const todo = ref({});

const editedTodo = ref('');
const editedDesc = ref('');
const editedDone = ref(false);

async function fetchTodo() {
  try {
    const todoUrl = BASE_URL + `/todos/${id}`;
    const todoRes = await axios.get(todoUrl);

    todo.value = todoRes.data;

    editedTodo.value = todo.value.todo;
    editedDesc.value = todo.value.desc;
    editedDone.value = todo.value.done;

    console.log('TODO EDIT 데이터 : ', todo.value);
  } catch (e) {
    alert('TODO EDIT 통신 ERR 발생');
    console.error(e);
  }
}

fetchTodo();
</script>

<style lang="scss" scoped></style>
