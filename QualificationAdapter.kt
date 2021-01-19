class QualificationAdapter(
    var click: (EducationModel) -> Unit
) : DataBindingAdapter<EducationModel>(DiffCallback()) {

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_education_qualification
    }

    override fun onBindViewHolder(holder: DataBindingViewHolder<EducationModel>, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.itemView.let {
            it.editButton.onClick {
                click(getItem(position))
            }
        }
    }
}
