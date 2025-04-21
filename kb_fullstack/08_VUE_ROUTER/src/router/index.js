import { createRouter, createWebHistory } from 'vue-router';
import HomePage from '../pages/HomePage.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage,
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../pages/AboutPage.vue'),
    },
    {
      path: '/dynamic/:mood',
      name: 'dynamic',
      component: () => import('@/pages/DynamicPage.vue'),
      props: true,
    },
    {
      path: '/user/:id',
      name: 'user',
      component: () => {
        return import('@/pages/UserPage.vue');
      },
    },

    {
      path: '/cors',
      name: 'cors',
      component: () => import('@/pages/CorsPage.vue'),
    },
    {
      path: '/ex-cors',
      name: 'ex-cors',
      component: () => import('@/pages/CorsExPage.vue'),
    },
    {
      path: '/:pathMatch(.*)*',
      name: 'notfound',
      component: () => {
        return import('@/pages/NotFound.vue');
      },
    },
  ],
});

export default router;
