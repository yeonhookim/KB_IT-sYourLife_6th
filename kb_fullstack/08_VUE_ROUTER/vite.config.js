import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueDevTools from 'vite-plugin-vue-devtools';

export default defineConfig({
  plugins: [vue(), vueDevTools()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },
  server: {
    proxy: {
      '/api': {
        target:
          'https://port-0-tetz-night-back-m5yo5gmx92cc34bc.sel4.cloudtype.app',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api/, ''),
      },
      // https://localhost:5173/api + /cors/ex
      // https://port-0-tetz-night-back-m5yo5gmx92cc34bc.sel4.cloudtype.app + /cors/ex
      '/cors-ex': {
        target:
          'https://port-0-tetz-night-back-m5yo5gmx92cc34bc.sel4.cloudtype.app/cors/ex/cors-ex',
        changeOrigin: true,
        // rewrite: (path) => path.replace(/^\/cors-ex/, ''),

        // '/cors/ex': {
        //   target:
        //     'https://port-0-tetz-night-back-m5yo5gmx92cc34bc.sel4.cloudtype.app',
        //   changeOrigin: true,
      },
    },
  },
});
