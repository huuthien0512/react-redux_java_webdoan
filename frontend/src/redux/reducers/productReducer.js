import { 
  FETCH_PRODUCTS_SUCCESS,
  FETCH_PRODUCTS_FAIL,
  FETCH_PRODUCTS_REQUEST } from '../constants/productConstants'

const initState = {
  products: []
};

const productReducer = (state = initState, action) => {
  switch (action.type) {
    case FETCH_PRODUCTS_REQUEST:
      return { loading: false, ...state };
    case FETCH_PRODUCTS_SUCCESS:
      return {
        ...state,
        products: action.payload
      };
  }

  return state;
};

export default productReducer;
