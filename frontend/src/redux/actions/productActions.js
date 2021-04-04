import axios from 'axios';

import {
  FETCH_PRODUCTS_SUCCESS,
  FETCH_PRODUCTS_FAIL,
  FETCH_PRODUCTS_REQUEST,
  SEARCH_PRODUCTS_REQUEST,
  SEARCH_PRODUCTS_SUCCESS,
  SEARCH_PRODUCTS_FAIL} from '../constants/productConstants';
import {BASE_URL} from '../constants/URL_SERVER';

// const fetchProductsSuccess = products => ({
//   type: FETCH_PRODUCTS_SUCCESS,
//   payload: products
// });

export const fetchProducts = () => async(dispatch) => {
  try {
    dispatch({ type: FETCH_PRODUCTS_REQUEST });
    const {data} = await axios.get(`${BASE_URL}/products`);
    dispatch({
      type: FETCH_PRODUCTS_SUCCESS,
      payload: data,
    });
  } catch (error) {
    dispatch({
      type: FETCH_PRODUCTS_FAIL,
     // payload: error.response && error.response.data.msg,
      payload: [],
    });
  }
};

export const searchProducts = (searchString) => async(dispatch) => {
 
  try {
    //dispatch({ type: SEARCH_PRODUCTS_REQUEST });
    
    const {data} = await axios.post(`${BASE_URL}/product/search`, {searchString});
    dispatch({
      type: SEARCH_PRODUCTS_SUCCESS,
      payload: data,
    });
  } catch (error) {
    dispatch({
      type: SEARCH_PRODUCTS_FAIL,
     // payload: error.response && error.response.data.msg,
      payload: [],
    });
  }
};



//fetch products
// export const fetchProducts = products => {
//   return dispatch => {
//     dispatch(fetchProductsSuccess(products));
//   };
// };
